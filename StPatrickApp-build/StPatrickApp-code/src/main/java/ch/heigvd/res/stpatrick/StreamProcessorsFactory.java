package ch.heigvd.res.stpatrick;

/**
 * This class is responsible for providing different types of Stream Processors.
 * 
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {
    
    
IStreamProcessor process = new BasicStreamProcessor();
IStreamProcessor out = new BasicStreamProcessor();
  @Override
  public IStreamProcessor getProcessor() {
    return new BasicStreamProcessor();
  }

  @Override
  public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {
      if( process.process(processorName, out) == out){
          return process;
      
      }else{
      throw new UnknownNameException("The factory does not know any processor called " + processorName);
   
      }
    
  }

}
