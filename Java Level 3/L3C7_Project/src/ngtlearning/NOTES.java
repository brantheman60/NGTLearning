package ngtlearning;

public class NOTES {

	/**
	 * Read/Write Operations:::
	 * Java has classes for read/write operations
	 * -ReadAllBytes, readAlLines for commonly used, small files
	 * -newBufferedReader, newBufferedWrite for text files
	 * -newInputStream, newOutputStream for streams, unbuffered use with existing APIs
	 * -newByteChannel for channels and ByteBuffers
	 * -FileChannel for advanced features, file-locking, memory-mapped I/O
	 * FileReader and BufferedReader make programs faster!
	 * 
	 * Reading a File by Using Buffered Stream I/O example:
	 *  FileReader fileReader = new FileReader(studentFile);
	 *  BufferedReader reader = new BUffered Reader(fileReader);
	 *  line = reader.readLine();
	 * Writing a File by Using Buffered Stream I/O
	 *  FileWriter fileWriter = new FileWriter(studentFile, false);
	 *  BufferedWriter writer = new BufferedWriter(fileWriter);
	 *  writer.write(writeString);
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
