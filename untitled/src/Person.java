public class Person {
   String name;
   int age;
   String gender;
   String address;
   void printInfo() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Gender: " + gender);
      System.out.println("Address: " + address);
      }
      void hello() {
      System.out.println("Hello, I am " + name);
      }
      int sum(int a, int b) {
      return a + b;
      }
      char test(int a) {
         if (a > 1) {
            return 'A';
         }
         else  {
            return 'B';
         }

      }
      void swap(int a,int b){
      int temp = a;
      a = b;
      b= temp;
      }
      void modify(Person person){
      person.name = "Lbwnb";
      }
      void setName(String name){
      this.name = name;
      }
   }
