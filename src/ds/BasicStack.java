package ds;

public class BasicStack<X> {
    private X [] data;
    private int stackpointer;

    public BasicStack(){
        data = (X[]) new Object[1000];
        stackpointer = 0;
    }

    public void push(X newItem){
        data[stackpointer++] = newItem;
    }

    public X pop(){
        if (stackpointer == 0) {
            throw new IllegalStateException("No more items on the stack");
        }
        return data[--stackpointer];
    }

    public boolean contains(X item){
        boolean found = false;
        for(int i = 0;i < stackpointer; i++){
            if(data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(X item){
        while(stackpointer > 0){
            X tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find item on the stack: " + item);
    }

    public int size(){
        return stackpointer;
    }
}
