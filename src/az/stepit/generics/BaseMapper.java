package az.stepit.generics;

public interface BaseMapper<F, T> {

    T convert(F data);
}
