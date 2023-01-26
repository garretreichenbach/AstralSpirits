package thederpgamerx.astralspirits.entity.spirit;

/**
 * [Description]
 *
 * @author TheDerpGamerX (TheDerpGamer#0027)
 */
public enum SpiritMode {
	//Todo: Localize
	PASSIVE("Passive", "The spirit will avoid combat and act only as support."),
	AGGRESSIVE("Aggressive", "The spirit will attack any hostile entity it sees."),
	DEFENSIVE("Defensive", "The spirit will attack any hostile entity that attacks its owner.");

	public final String name;
	public final String description;

	SpiritMode(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
