public class FizzBuzzTranslate {
    private int number;

    private String stringphannguyen;
    private String stringphandu;
    private String []arrays={"mot","hai","ba","bon","nam","sau","bay","tam","chin"};
    public void getPhanNguyen1(){
        int nguyen=this.number/10;
        for (int i = 1; i < 9; i++) {
            if(nguyen==i) {
                this.stringphannguyen = this.arrays[i - 1];
            }
        }
    }

    public void getPhanNguyen2(){
        String str="muoi";
        int nguyen=this.number/10;
        for (int i = 1; i < 9; i++) {
            if(nguyen==i) {
                this.stringphannguyen = str;
            }
        }
    }

    public void getPhanDu(){
        int du=this.number%10;
        for (int i = 1; i < 9; i++) {
            if(du==i) {
                this.stringphandu = this.arrays[i - 1];
            }
        }
    }
    public FizzBuzzTranslate(int number){
        this.number=number;
    }
    public boolean check3(){
        if(this.number%3==0){
            return true;
        } return false;
    }
    public boolean check5(){
        if(this.number%5==0){
            return true;
        } return false;
    }
    public String translate(){
        if(this.number>=100 || this.number<0){
            return "so nay khong phai so < 100";
        } else {
            if (check3() && check5()) {
                return "fizzbuzz";
            } else if (check3()) {
                return "fizz";
            } else if (check5()) {
                return "buzz";
            } else
                if (this.number < 10) {
                getPhanDu();
                return this.stringphandu;
                } else {
                    if(this.number<20){
                        getPhanNguyen2();
                        getPhanDu();
                        return this.stringphannguyen +" "+ this.stringphandu;
                    } else {
                        getPhanNguyen1();
                        getPhanDu();
                        return this.stringphannguyen +" "+ this.stringphandu;
                    }
                }
        }
    }
}

