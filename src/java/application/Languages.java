package application;
import java.util.Locale;

public enum Languages {
	pt_BR {
		@Override
		public Locale getLocale() {
			return new Locale("pt", "BR");	
		}
	},
	en_US {
		@Override
		public Locale getLocale() {
			return Locale.US;
		}
	};
	
	public abstract Locale getLocale();
}
