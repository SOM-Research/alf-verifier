package pvaAnalyzer;

import java.util.Hashtable;
import java.util.Iterator;

public class PVAHashtable<K,V> extends Hashtable<K,V> {

	private static final long serialVersionUID = 1L;
	
	@Override
	public synchronized boolean containsKey(Object key) {
		Iterator<K> keysIter = this.keySet().iterator();
		while ( keysIter.hasNext() ){
			K currentKey = keysIter.next();
			if ( currentKey.getClass().getCanonicalName().equals( key.getClass().getCanonicalName() ) && key.equals( currentKey ) ){
				return true;
			}
		}
		return false;
	}

	@Override
	public synchronized V get(Object key) {	
		Iterator<java.util.Map.Entry<K, V>> entryIter = this.entrySet().iterator();
		while ( entryIter.hasNext() ){
			java.util.Map.Entry<K, V> entry = entryIter.next();
			if ( entry.getKey().getClass().getCanonicalName().equals( key.getClass().getCanonicalName() ) && key.equals( entry.getKey() ) ){
				return entry.getValue();
			}
		}
		return null;
	}
}