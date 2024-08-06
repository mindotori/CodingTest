package Game;

public class Water {
    private int weight = 30;

    //물이 스스로 줄어들고 있지 않다.

    //물이 스스로 줄어드는 메서드
    public void disappearWater(){
        weight-=10;
    }
}
