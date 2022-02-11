public class TestStack {
    public static void main(String[] args){
        stackOfIntegers stack = new stackOfIntegers();
        stack.pop();
        for (int i=0; i<10; i++)
            stack.push(i);
        //System.out.println("Top of the stack: "+stack.peek());
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");

    }
}
