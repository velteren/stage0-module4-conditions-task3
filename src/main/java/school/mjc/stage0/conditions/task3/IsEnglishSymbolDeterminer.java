package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int tmp = (int) symbol;
        if((tmp >= 65 && tmp<=90) || (tmp>=97 && tmp<=122)){
            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }
}
