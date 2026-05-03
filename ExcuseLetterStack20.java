public class ExcuseLetterStack20 {
    ExcuseLetter20[] stack;
    int top ,size;

    public ExcuseLetterStack20(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter20[size];
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

    void push(ExcuseLetter20 exc) {
        if(!isFull()) {
            top++;
            stack[top] = exc;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    ExcuseLetter20 pop() {
        if(!isEmpty()) {
            ExcuseLetter20 exc = stack[top];
            top--;
            return exc;
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    ExcuseLetter20 peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!");
            return null;
        }
    }

    void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i <= top; i++)  {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Letter found!");
                stack[i].print();
                return;
            }
        }
        System.out.println("Letter not found.");
    }


}
