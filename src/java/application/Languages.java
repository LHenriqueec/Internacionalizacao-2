package application;
import java.util.Locale;

public enum Languages {
	PORTUGUES {
		@Override
		public Locale getLocale() {
			return new Locale("pt", "BR");	
		}
	},
	INGLES {
		@Override
		public Locale getLocale() {
			return Locale.US;
		}
	},
	FRANCES {
		@Override
		public Locale getLocale() {
			return Locale.CANADA_FRENCH;
		}
	};
	
	public abstract Locale getLocale();
}
