package SecondPackage;

import FirstPackage.*;

public class SecondFile{
    protected class inner implements FirstFile{
        public inner(){}
        public String show(){return "Hello World!";}
    }
}
