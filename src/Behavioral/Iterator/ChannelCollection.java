package Behavioral.Iterator;

/**
 * Created by cristiano on 08/02/17.
 *
 * ChannelCollection interface defines the contract for our collection class implementation.
 * Notice that there are methods to add and remove a channel but there is no method that
 * returns the list of channels.
 * ChannelCollection has a method that returns the iterator for traversal.
 *
 */
public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);

}
