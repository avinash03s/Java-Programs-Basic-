package Interfaces;

interface Unknown{
    void take();
}
interface Known extends Unknown{
    void take();
}
class Taken implements Unknown,Known{
    @Override
    public void take() {
        System.out.println();
    }
}

public class Interface {
}
