import java.util.Scanner;

/**
 * @author Matthew 09.06.2022
 **/
public class TelephoneCalls {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        String phone = "83341994118";
        System.out.println(checker(phone,"86406361642"));
        System.out.println(checker(phone,"83341994118"));
        System.out.println(checker(phone,"86406361642"));

        String phone2 = "";

    }

    public static String checker(String phone, String checkPhone1){
        if (Phone.phonePrepare(phone).equals(Phone.phonePrepare(checkPhone1))){
            return "YES";
        } else return  "NO";
    }

}
class Phone {

        public static String codePrepare(String phoneNumber){

        String[] splitingNumber = phoneNumber.split(""); //превращаем номер в массив, чтобы избавиться от скобок и тире
        // здесь непосредственно удаляем () и -, а также 8 и +7
        for (int i = 0; i < splitingNumber.length; i++) {
            if (splitingNumber[0].equals("+") && splitingNumber[1].equals("7")){
                splitingNumber[0] = "";
                splitingNumber[1] = "";
            }
            if (splitingNumber[0].equals("8")){
                splitingNumber[0] = "";
            }
            if (splitingNumber[i].equals("(")){
                splitingNumber[i] = "";
            }
            if (splitingNumber[i].equals(")")){
                splitingNumber[i] = "";
            }
            if (splitingNumber[i].equals("-")){
                splitingNumber[i] = "";
            }
        }
        // сращиваем массив в единую строку
        StringBuilder finalyPhone = new StringBuilder();
        for (String sd:splitingNumber) {
            finalyPhone.append(sd);
        }

        String[] code = finalyPhone.toString().split("");

        // вычленяем код

        StringBuilder codeSB = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            codeSB.append(code[i]);
        }

        if (codeSB.length()<11){
            return "495";
        } else return String.valueOf(codeSB);
    }
    public static String phonePrepare(String phoneNumber){
        String[] splitingNumber = phoneNumber.split(""); //превращаем номер в массив, чтобы избавиться от скобок и тире
        // здесь непосредственно удаляем () и -, а также 8 и +7
        for (int i = 0; i < splitingNumber.length; i++) {
            if (splitingNumber[0].equals("+") && splitingNumber[1].equals("7")){
                splitingNumber[0] = "";
                splitingNumber[1] = "";
            }
            if (splitingNumber[0].equals("8")){
                splitingNumber[0] = "";
            }
            if (splitingNumber[i].equals("(")){
                splitingNumber[i] = "";
            }
            if (splitingNumber[i].equals(")")){
                splitingNumber[i] = "";
            }
            if (splitingNumber[i].equals("-")){
                splitingNumber[i] = "";
            }
        }
        // сращиваем массив в единую строку
        StringBuilder finalyPhone = new StringBuilder();
        for (String sd:splitingNumber) {
            finalyPhone.append(sd);
        }


        String[] phone = finalyPhone.toString().split("");
        StringBuilder phoneSB = new StringBuilder();
        // вычленяем номер
        for (int i = 3; i < phone.length; i++) {
            phoneSB.append(phone[i]);
        }
        return String.valueOf(phoneSB);
    }
}