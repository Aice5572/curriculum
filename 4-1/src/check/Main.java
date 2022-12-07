package check;

import constants.Constants;

public class Main {
    private static String firstName = "森";
    private static String secondName = "英志";
    private static String printName() {
        return firstName +secondName;
    }

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("printNameメソッド→" +  printName () );
    
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        
        RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_LUKE , Constants.CHECK_CLASS_R2D2);
        robotpet.introduce();
    }

}
