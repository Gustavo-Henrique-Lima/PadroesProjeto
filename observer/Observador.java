package observer;

import java.util.List;

public interface Observador {

	void notificar(int num);
	String discando(List<Integer> num);
}