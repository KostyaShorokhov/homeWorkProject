package discriminant.interfaces;

@FunctionalInterface
public interface CheckDiscriminant<T> {

  T calcDisc(float a, float b, float c);
}
