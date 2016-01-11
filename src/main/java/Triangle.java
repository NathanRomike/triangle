public class Triangle {

  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle(int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public int getSideA() {
    return mSideA;
  }

  public int getSideB() {
    return mSideB;
  }

  public int getSideC() {
    return mSideC;
  }

  public boolean isTriangle() {
    if ((mSideA + mSideB > mSideC) && (mSideB + mSideC > mSideA) && (mSideC + mSideA > mSideB)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isScalene() {
    if ((mSideA != mSideB) && (mSideB != mSideC) && (mSideC != mSideA)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isIsosceles() {
    if ((mSideA == mSideB) || (mSideB == mSideC) || (mSideC == mSideA)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isEquilateral() {
    if ((mSideA == mSideB) && (mSideB == mSideC) && (mSideC == mSideA)) {
      return true;
    } else {
      return false;
    }
  }

}
