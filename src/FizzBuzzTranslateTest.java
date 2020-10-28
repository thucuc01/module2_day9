import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void check3() {
        FizzBuzzTranslate number=new FizzBuzzTranslate(3);
        boolean check=true;
        boolean result= number.check3();
        assertEquals(check,result);
    }

    @org.junit.jupiter.api.Test
    void check5() {
        FizzBuzzTranslate number=new FizzBuzzTranslate(5);
        boolean check=true;
        boolean result= number.check5();
        assertEquals(check,result);
    }

    @org.junit.jupiter.api.Test
    void translate() {
        FizzBuzzTranslate number=new FizzBuzzTranslate(15);
        String check= "fizzbuzz";
        String result=number.translate();
        assertEquals(check,result);
    }


    @org.junit.jupiter.api.Test
    void translate2() {
        FizzBuzzTranslate number=new FizzBuzzTranslate(11);
        String check= "muoi mot";
        String result=number.translate();
        assertEquals(check,result);

    }
    @org.junit.jupiter.api.Test
    void translate3() {
        FizzBuzzTranslate number=new FizzBuzzTranslate(12);
        String check= "fizz";
        String result=number.translate();
        assertEquals(check,result);

    }
    @org.junit.jupiter.api.Test
    void translate4() {
        FizzBuzzTranslate number=new FizzBuzzTranslate(67);
        String check= "sau bay";
        String result=number.translate();
        assertEquals(check,result);


    }
}