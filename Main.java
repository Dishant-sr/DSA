public class Main {
    int Max = 10;
    int top = -1;
    int Stack[];

    void push(int value){
        if(top == Max -1){
            System.out.println("Stack overflow");

        }else{
            top++;
            Stack[top] = value;
            System.out.println(value + " pushed in the stack");
        }
        
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            int value = Stack[top];
            top--;
            System.out.println(value+" popped from the stack");
        }

    }

    void peek(){
        if(top == -1){
                        System.out.println("Stack is empty");
        }else{
            System.out.println(Stack[top]+" The top element in the stack");


        
    }

   
}

void Display(){
            if(top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("The stack elements: ");
            for(int i= 0; i <= top; i++ ){
                System.out.println(Stack[i]);
            }
           
        }

    }
    public static void main(String[] args) {
        Main stack = new Main();
        stack.Stack = new int[stack.Max];
        stack.push(60);
        stack.push(70);
        stack.push(90);
        stack.push(100);
        stack.pop();
        stack.peek();
        stack.Display();
    }


}