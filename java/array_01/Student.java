package array_01;

//     ===02===
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name:%s, score:%d)",name,score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<Student>();
        arr.addLast(new Student("zhangsan",99));
        arr.addLast(new Student("lisi",87));
        arr.addLast(new Student("wangwu",89));
        System.out.println(arr);


    }
}
