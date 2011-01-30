package tv.porst.swfretools.parser.structures;

import java.util.ArrayList;
import java.util.List;

import tv.porst.splib.binaryparser.UINT16;
import tv.porst.splib.binaryparser.UINT32;
import tv.porst.splib.binaryparser.UINT8;
import tv.porst.swfretools.parser.tags.Tag;

/**
 * Represents a SWF file.
 * 
 * @author sp
 *
 */
public final class SWFFile {

	/**
	 * First signature byte.
	 */
	private final UINT8 signature1;

	/**
	 * Second signature byte.
	 */
	private final UINT8 signature2;

	/**
	 * Third signature byte.
	 */
	private final UINT8 signature3;

	/**
	 * File version.
	 */
	private final UINT8 version;

	/**
	 * Length of entire file in bytes.
	 */
	private final UINT32 fileLength;

	/**
	 * Frame size in twips.
	 */
	private final Rect frameSize;

	/**
	 * Frame delay in 8.8 fixed number of frames per second.
	 */
	private final UINT16 frameRate;

	/**
	 * Total number of frames in file.
	 */
	private final UINT16 frameCount;

	/**
	 * List of tags in file.
	 */
	private final List<Tag> tags;

	/**
	 * Creates a new SWF file object.
	 * 
	 * @param signature1 First signature byte.
	 * @param signature2 Second signature byte.
	 * @param signature3 Third signature byte.
	 * @param version File version.
	 * @param fileLength Length of entire file in bytes.
	 * @param frameSize Frame size in twips.
	 * @param frameRate Frame delay in 8.8 fixed number of frames per second.
	 * @param frameCount Total number of frames in file.
	 * @param tags List of tags in file.
	 */
	public SWFFile(final UINT8 signature1, final UINT8 signature2, final UINT8 signature3,
			final UINT8 version, final UINT32 fileLength, final Rect frameSize, final UINT16 frameRate,
			final UINT16 frameCount, final List<Tag> tags) {

		this.signature1 = signature1;
		this.signature2 = signature2;
		this.signature3 = signature3;
		this.version = version;
		this.fileLength = fileLength;
		this.frameSize = frameSize;
		this.frameRate = frameRate;
		this.frameCount = frameCount;
		this.tags = new ArrayList<Tag>(tags);

	}

	/**
	 * Returns the length of entire file in bytes.
	 *
	 * @return The length of entire file in bytes.
	 */
	public UINT32 getFileLength() {
		return fileLength;
	}

	/**
	 * Returns the total number of frames in file.
	 *
	 * @return The total number of frames in file.
	 */
	public UINT16 getFrameCount() {
		return frameCount;
	}

	/**
	 * Returns the frame delay in 8.8 fixed number of frames per second.
	 *
	 * @return The frame delay in 8.8 fixed number of frames per second.
	 */
	public UINT16 getFrameRate() {
		return frameRate;
	}

	/**
	 * Returns the frame size in twips.
	 *
	 * @return The frame size in twips.
	 */
	public Rect getFrameSize() {
		return frameSize;
	}

	/**
	 * Returns the first signature byte.
	 *
	 * @return The first signature byte.
	 */
	public UINT8 getSignature1() {
		return signature1;
	}

	/**
	 * Returns the second signature byte.
	 *
	 * @return The second signature byte.
	 */
	public UINT8 getSignature2() {
		return signature2;
	}

	/**
	 * Returns the third signature byte.
	 *
	 * @return The third signature byte.
	 */
	public UINT8 getSignature3() {
		return signature3;
	}

	/**
	 * Returns the list of tags in file.
	 *
	 * @return The list of tags in file.
	 */
	public List<Tag> getTags() {
		return new ArrayList<Tag>(tags);
	}

	/**
	 * Returns the file version.
	 *
	 * @return The file version.
	 */
	public UINT8 getVersion() {
		return version;
	}
}