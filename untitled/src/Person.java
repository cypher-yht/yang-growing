public class Person {
   String name;
   int age;
   String gender;
   String address;
   public Person(String name, int age, String gender, String address) {
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.address = address;
   }
   public Person( String name, String gender, String address) {
      this(name,0,gender,address);
   }
   public String toString() {
      return "Name: " + name + " Age: " + age + " Gender: " + gender + " Address: " + address;
   }
   }
