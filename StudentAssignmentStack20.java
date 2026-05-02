public class StudentAssignmentStack20 {
    Student20[] stack;
    int top, size;

    public StudentAssignmentStack20(int size) {
        this.size = size;
        top = -1;
        stack = new Student20[size];
    }

    boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student20 std) {
        if(!isFull()) {
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    Student20 pop() {
        if(!isEmpty()) {
            Student20 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    Student20 peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    Student20 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    int count() {
        return top + 1;
    }

    String convertToBinary(int grade) {
        ConversionStack20 stack = new ConversionStack20();
        while (grade != 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

    void print(){ 
        for(int i = 0; i <= top; i++){ 
            System.out.println(stack[i].nim+"\t"+stack[i].name+"\t" 
            +stack[i].className); 
        } 
        System.out.print(""); 
    } 
    
}
