package Day24.com.hspedu.Homework08;

public class Homework08 {
    public static void main(String[] args) {

        Color green=Color.GREEN;//获取枚举类里的 常量
        green.show();
        switch (green){
            case RED:
                System.out.println();
                break;
            case BLUE:
            case Black:
            case GREEN:
            case YELLOW:
            default:
        }
    }
}

enum Color implements IA{

    RED(255,0,0)
    , BLUE(0,0,255)
    , Black(0,0,0)
    , YELLOW(255,255,0)
    , GREEN(0,255,0)
    ;

    private int  redValue,greenValue,blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }


    @Override
    public void show() {
        System.out.println(redValue+"\t"+greenValue+"\t"+blueValue);
    }


}
interface IA{

    public void show();
}
