public class stackOfIntegers {
    public int[] elements;
    public int top;
    public int size;
    public stackOfIntegers(){
        this.elements = new int[16];
        this.size = 16;
    }
    public stackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = capacity;
        this.top = -1;
    }
    public int peek(){
        return this.top;
    }
    public void push(int value){
        if (isFull()) {
            System.out.println("Stack is full");
          }
          this.elements[++this.top] = value;
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return this.elements[this.top--];
    }
    public int getSize(){
        return this.top + 1;
    }
    public Boolean isFull() {
        return this.top == this.size - 1;
    }
    public Boolean isEmpty() {
        return this.top == -1;
    }
}
