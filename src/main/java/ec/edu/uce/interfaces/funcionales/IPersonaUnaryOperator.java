package ec.edu.uce.interfaces.funcionales;


public interface IPersonaUnaryOperator<T> extends IPersonaFunction<T,T>{
	T apply(T arg1);
}
