package TestDisco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.Disco.Disco;

class TestDisco {

	@Test
	void test() {
		Disco disco1 = new Disco (50.0, 100.0);
		
		disco1.calcularSuperficie();
		disco1.calcularPerimetroExterior();
		disco1.calcularPerimetroInterior();
		
		assertEquals(23561.9449, disco1.getSuperficie(), 0.01);
		assertEquals(628.3185307, disco1.getPerimetroExterior(), 0.01);
		assertEquals(314.1592654, disco1.getPerimetroInterior(), 0.01);
		
		System.out.println("El radio interior es: "+disco1.getRadioInterior()+"\n"+"El radio exterior es: "+disco1.getRadioExterior()+"\n"+"El perímetro Interior es: "+disco1.getPerimetroInterior() +
				"\n"+"El perímetro Exterior es: "+disco1.getPerimetroExterior()+"\n"+"La superficie es: "+disco1.getSuperficie());
	}

}
