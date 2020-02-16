package axone.assignments.module4;

public class EvenNumber {
        private int n;
//constructor
    public EvenNumber (int n){
        this.n=n;

    }
//method
    public void generate(){

        if(n%2!=0){

            n=n+1;
        }
        for(int i=1 ; i<=20; i++) {
            System.out.println(n);
            n= n+2;
        }


    }


}
