package Task1;

    public class  MyClass <T>{
        T field;
        public MyClass(T field) {
            this.field=field;
        }
        public void show() {
            System.out.println(field.getClass());
        }
    }

    class Main {
        public static void main(String[] args) {
            MyClass<Integer> myClass = new MyClass<>(33);
            myClass.show();
        }
    }

