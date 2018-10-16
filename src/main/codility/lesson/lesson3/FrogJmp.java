package codility.lesson.lesson3;

public class FrogJmp {
	public int solution(int X, int Y, int D) {
        int rv = (Y-X)/D;
        return ((Y-X)%D==0)?rv:rv+1;
    }
}
