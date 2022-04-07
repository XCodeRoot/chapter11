package Day22.com.hspedu.enum_.EnumerationExercise01;

public class EnumerationExercise01 {

    public static void main(String[] args) {

        Week[] values=Week.values();//隐式父类Enum，有values（）方法，可以返回所有枚举常量

        System.out.println("===所有星期的信息如下===");
        for (Week week: values ) {
            System.out.println(week);
        }
    }
}

enum Week{

    Monday("星期一"),
        Tuesday("星期二"),
            Wednesday("星期三"),
                Thursday("星期四"),
                    Friday("星期五"),
                        Saturday("星期六"),
                            Sunday("星期天");


    private String date;//私有属性

    private Week(String date) {//私有构造器
        this.date = date;
    }

    @Override
    public String toString() {
        return date;
    }
}
