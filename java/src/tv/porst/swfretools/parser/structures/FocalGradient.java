package tv.porst.swfretools.parser.structures;

import java.util.ArrayList;
import java.util.List;

import tv.porst.splib.binaryparser.UBits;

/**
 * Represents a FocalGradient structure.
 * 
 * @author sp
 *
 */
public final class FocalGradient implements IGradient {

	/**
	 * Spread mode.
	 */
	private final UBits spreadMode;

	/**
	 * Interpolation mode.
	 */
	private final UBits interpolationMode;

	/**
	 * Number of gradient records.
	 */
	private final UBits numGradients;

	/**
	 * Gradient records.
	 */
	private final List<GradRecord> gradientRecords;

	/**
	 * Focal point location.
	 */
	private final Fixed8 focalPoint;

	/**
	 * Creates a new FocalGradient object.
	 * 
	 * @param spreadMode Spread mode.
	 * @param interpolationMode Interpolation mode.
	 * @param numGradients Number of gradient records.
	 * @param gradientRecords Gradient records.
	 * @param focalPoint Focal point location.
	 */
	public FocalGradient(final UBits spreadMode, final UBits interpolationMode,
			final UBits numGradients, final List<GradRecord> gradientRecords,
			final Fixed8 focalPoint) {

		this.spreadMode = spreadMode;
		this.interpolationMode = interpolationMode;
		this.numGradients = numGradients;
		this.gradientRecords = new ArrayList<GradRecord>(gradientRecords);
		this.focalPoint = focalPoint;

	}

	/**
	 * Returns the focal point location.
	 * 
	 * @return The focal point location.
	 */
	public Fixed8 getFocalPoint() {
		return focalPoint;
	}

	/**
	 * Returns the gradient records.
	 *
	 * @return The gradient records.
	 */
	public List<GradRecord> getGradientRecords() {
		return new ArrayList<GradRecord>(gradientRecords);
	}

	/**
	 * Returns the interpolation mode.
	 *
	 * @return The interpolation mode.
	 */
	public UBits getInterpolationMode() {
		return interpolationMode;
	}

	/**
	 * Returns the number of gradient records.
	 *
	 * @return The number of gradient records.
	 */
	public UBits getNumGradients() {
		return numGradients;
	}

	/**
	 * Returns the spread mode.
	 *
	 * @return The spread mode.
	 */
	public UBits getSpreadMode() {
		return spreadMode;
	}
}