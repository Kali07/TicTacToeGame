public class Case {
    private char value;

    public Case(char c){
        this.value = c;
    }
    public Case(){
        this.value = ' ';
    }

    public char setValue(char value) {
        this.value = value;
        return value;
    }

    public  char getValue(){
        return this.value;
    }
}