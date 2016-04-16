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
	JAPONES {
		@Override
		public Locale getLocale() {
			return Locale.JAPAN;
		}
	},
	ITALIANO {
		@Override
		public Locale getLocale() {
			return Locale.ITALY;
		}
	};
	
	public abstract Locale getLocale();
}
