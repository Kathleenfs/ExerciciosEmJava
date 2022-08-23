
public class TimeTest {
	public static void main(String[] args) {
		AulaTime t = new AulaTime(0,5,23);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(8,25);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(12,10);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
