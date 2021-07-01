package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Sachin Rane on 7/1/21
 */
public class ReflectionUtils {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Sachin");
		employee.setCity("");//this will set to null

		replaceAllEmptyStringFieldsWithNull(employee);
		
		if (null == employee.getCity()) {
			System.out.println("replaceAllEmptyStringFieldsWithNull converted blank string to null");
		}
	}

	public static void replaceAllEmptyStringFieldsWithNull(Object object) {
		if (null == object) {
			return;
		}
		Method[] methodsOfObject = object.getClass().getDeclaredMethods();
		Method methodRef = null;
		try {
			for (Method method : methodsOfObject) {
				methodRef = method;
				method.setAccessible(true);
				if (isGetType(method)) {
					//skip list, set, map or array objects
					if (skipObjectsCheck(method)) {
						continue;
					}
					if (method.getReturnType() == String.class) {
						String value = (String) method.invoke(object);
						if ("".equals(value)) {
							Field field = getFieldByFieldName(object, method.getName().replace("get", ""));
							if (null != field) {
								field.setAccessible(true);
								field.set(object, null);
							}
						}
					} else {
						replaceAllEmptyStringFieldsWithNull(method.invoke(object));
					}
				}
			}
		} catch (IllegalAccessException ex) {
			System.out.println("IllegalAccessException while invoking method for class : " + object.getClass().getName()
					+ " and method : " + (null != methodRef ? methodRef.getName() : null));
		} catch (InvocationTargetException ex) {
			System.out.println("InvocationTargetException while invoking method for class : " + object.getClass().getName()
					+ " and method : " + (null != methodRef ? methodRef.getName() : null));
		}

	}

	static boolean skipObjectsCheck(Method method) {
		if (method.getReturnType().isArray()) return true;
		if (!(method.getGenericReturnType() instanceof ParameterizedType)) return false;
		ParameterizedType parametrizedReturnType = (ParameterizedType) method.getGenericReturnType();
		if (parametrizedReturnType.getRawType() == List.class
				|| parametrizedReturnType.getRawType() == Set.class
				|| parametrizedReturnType.getRawType() == Map.class) {
			return true;
		}
		return false;
	}

	static Field getFieldByFieldName(Object obj, String fieldName) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for(Field f : fields){
			if (f.getName().equalsIgnoreCase(fieldName)) {
				return f;
			}
		}
		return null;
	}

	static boolean isGetType(Method method) {
		if (method.getName().startsWith("get")) return true;
		return false;
	}

	private static class Employee {
		String name;
		String city;
		List<String> list;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public List<String> getList() {
			return list;
		}

		public void setList(List<String> list) {
			this.list = list;
		}
	}
}
