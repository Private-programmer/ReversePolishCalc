class Stack{
    String[] arr;
    int top;

    public Stack(int i){
        arr = new String[20];
        top = 0;
    }

    public boolean isEmpty(){
        return(top == 0);
    }

    public void push(String s){
        arr[top] = s;
        top = top + 1;
    }

    public String pop(){
        top = top - 1;
        return arr[top];
    }
}