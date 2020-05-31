package kr.bean;
/**
 * Created by 안병길 on 2018-01-18.
 * Whya5448@gmail.com
 * Modified by harion01
 * harion01@gmail.com
 */

public class ToCSVConfig {
	public boolean isWriteSource() {
		return writeSource;
	}

	public void setWriteSource(boolean writeSource) {
		this.writeSource = writeSource;
	}

	public boolean isWriteFileName() {
		return writeFileName;
	}

	public void setWriteFileName(boolean writeFileName) {
		this.writeFileName = writeFileName;
	}

	public boolean isBeta() {
		return beta;
	}

	public void setBeta(boolean beta) {
		this.beta = beta;
	}

	boolean writeSource = false, writeFileName = false, beta = false;
}
