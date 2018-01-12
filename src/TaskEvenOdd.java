class TaskEvenOdd implements Runnable
{
    public int max;
    public Printer print;
    public boolean isEvenNumber;

    public TaskEvenOdd(Printer print, int max, boolean isEvenNumber)
    {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() 
    {
        int number = isEvenNumber == true ? 2 : 1;
        while(number<= max)
        {
            if(isEvenNumber)
            {
                print.printEven(number);
            }   
            else 
            {
                print.printOdd(number);
            }
            number+=2;
        }
    }
}