package model;

public class RealImage extends Image {

    private final BitMap bitMap;

    public RealImage(BitMap bitMap) {
        this.bitMap = bitMap;
    }
    
    @Override
    public BitMap getBitMap() {
        return bitMap;
    }

    @Override
    public Image getNext() {
        return null;
    }

    @Override
    public Image getPrev() {
        return null;
    }

    @Override
    public void setNext(Image image) {
    }

    @Override
    public void setPrev(Image image) {
    }
    
}
