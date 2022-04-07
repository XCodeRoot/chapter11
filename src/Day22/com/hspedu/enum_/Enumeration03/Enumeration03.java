package Day22.com.hspedu.enum_.Enumeration03;

public class Enumeration03 {

    public static void main(String[] args) {

        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
    }
}

enum Season{


//    public static final Season SPRING=new Season("春天","温暖");
//    public static final Season SUMMER=new Season("夏天","炎热");
//    public static final Season AUTUMN=new Season("秋天","凉爽");
//    public static final Season WINTER=new Season("冬天","寒冷");



    /**    如果使用enum来实现枚举类
     *  1.  使用enum代替class
     *  2.  SPRING("春天","温暖") 解读：常量名（参数列表）
     *  3.  如果有多个对象，用逗号间隔开
     *  4.  要求将 定义的常量对象 放在最前
     */
    SPRING("春天","温暖"),
                                    SUMMER("",""),
                                    AUTUMN("",""),
                                    WINTER("冬天","寒冷");
    private String name;
    private String desc;//描述description


    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}