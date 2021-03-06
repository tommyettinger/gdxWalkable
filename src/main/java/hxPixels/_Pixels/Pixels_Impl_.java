// Generated by Haxe 3.4.2
package hxPixels._Pixels;

public final class Pixels_Impl_
{
	static
	{
		hxPixels._Pixels.Pixels_Impl_.CHANNEL_MASK = 3;
	}
	
	public static int CHANNEL_MASK;
	
	public static hxPixels._Pixels.PixelsData _new(int width, int height, java.lang.Object alloc)
	{
		boolean __temp_alloc27 = ( (haxe.lang.Runtime.eq(alloc, null)) ? (true) : (haxe.lang.Runtime.toBool(alloc)) );
		return new PixelsData(width, height, __temp_alloc27, null);
	}
	
	
	public static int getByte(hxPixels._Pixels.PixelsData this1, int i)
	{
		return ( this1.bytes.b[( (( i & -4 )) + haxe.lang.Runtime.toInt(this1.format.channelMap.__get(( i & 3 ))))] & 255 );
	}
	
	
	public static int getPixel(hxPixels._Pixels.PixelsData this1, int x, int y)
	{
		int pos = ( ( ( y * this1.width ) + x ) << 2 );
		int r = ( (( this1.bytes.b[( pos + this1.format.ch1 )] & 255 )) << 16 );
		int g = ( (( this1.bytes.b[( pos + this1.format.ch2 )] & 255 )) << 8 );
		int b = ( this1.bytes.b[( pos + this1.format.ch3 )] & 255 );
		return ( ( r | g ) | b );
	}
	
	
	public static int getPixel32(hxPixels._Pixels.PixelsData this1, int x, int y)
	{
		int pos = ( ( ( y * this1.width ) + x ) << 2 );
		int a = ( (( this1.bytes.b[( pos + this1.format.ch0 )] & 255 )) << 24 );
		int r = ( (( this1.bytes.b[( pos + this1.format.ch1 )] & 255 )) << 16 );
		int g = ( (( this1.bytes.b[( pos + this1.format.ch2 )] & 255 )) << 8 );
		int b = ( this1.bytes.b[( pos + this1.format.ch3 )] & 255 );
		return ( ( ( a | r ) | g ) | b );
	}
	
	
	public static void setByte(hxPixels._Pixels.PixelsData this1, int i, int value)
	{
		this1.bytes.b[( (( i & -4 )) + haxe.lang.Runtime.toInt(this1.format.channelMap.__get(( i & 3 ))))] = ((byte) (value) );
	}
	
	
	public static void setPixel(hxPixels._Pixels.PixelsData this1, int x, int y, int value)
	{
		int pos = ( ( ( y * this1.width ) + x ) << 2 );
		int r = ( ( value >> 16 ) & 255 );
		int g = ( ( value >> 8 ) & 255 );
		int b = ( value & 255 );
		this1.bytes.b[( pos + this1.format.ch1 )] = ((byte) (r) );
		this1.bytes.b[( pos + this1.format.ch2 )] = ((byte) (g) );
		this1.bytes.b[( pos + this1.format.ch3 )] = ((byte) (b) );
	}
	
	
	public static void setPixel32(hxPixels._Pixels.PixelsData this1, int x, int y, int value)
	{
		int pos = ( ( ( y * this1.width ) + x ) << 2 );
		int a = ( ( value >> 24 ) & 255 );
		int r = ( ( value >> 16 ) & 255 );
		int g = ( ( value >> 8 ) & 255 );
		int b = ( value & 255 );
		this1.bytes.b[( pos + this1.format.ch0 )] = ((byte) (a) );
		this1.bytes.b[( pos + this1.format.ch1 )] = ((byte) (r) );
		this1.bytes.b[( pos + this1.format.ch2 )] = ((byte) (g) );
		this1.bytes.b[( pos + this1.format.ch3 )] = ((byte) (b) );
	}
	
	
	public static void fillRect(hxPixels._Pixels.PixelsData this1, int x, int y, int width, int height, int value)
	{
		int pos = ( ( ( y * this1.width ) + x ) << 2 );
		new PixelsData(width, 1, true, null).format = this1.format;
		int stride = ( width << 2 );
		{
			int _g1 = 0;
			while (( _g1 < width))
			{
				int x1 = _g1++;
				hxPixels._Pixels.Pixels_Impl_.setPixel32(new PixelsData(width, 1, true, null), x1, 0, value);
			}
			
		}
		
		{
			int _g11 = 0;
			while (( _g11 < height))
			{
				int y1 = _g11++;
				this1.bytes.blit(pos, new PixelsData(width, 1, true, null).bytes, 0, stride);
				pos += ( this1.width << 2 );
			}
			
		}
		
	}
	
	
	public static hxPixels._Pixels.PixelsData clone(hxPixels._Pixels.PixelsData this1)
	{
		new PixelsData(this1.width, this1.height, true, null).bytes.blit(0, this1.bytes, 0, this1.bytes.length);
		new PixelsData(this1.width, this1.height, true, null).format = this1.format;
		return new PixelsData(this1.width, this1.height, true, null);
	}
	
	
	public static hxPixels._Pixels.PixelsData fromBytes(haxe.io.Bytes bytes, int width, int height, hxPixels.PixelFormat format)
	{
		if (( format == null ))
		{
		}
		
		new PixelsData(width, height, false, null).bytes = bytes;
		return new PixelsData(width, height, false, null);
	}
	
	
	public static hxPixels._Pixels.PixelsData convertTo(hxPixels._Pixels.PixelsData this1, hxPixels.PixelFormat format)
	{
		return hxPixels._Pixels.Pixels_Impl_.convert(this1, format, true);
	}
	
	
	public static hxPixels._Pixels.PixelsData convert(hxPixels._Pixels.PixelsData pixels, hxPixels.PixelFormat toFormat, java.lang.Object inPlace)
	{
		boolean __temp_inPlace28 = ( (haxe.lang.Runtime.eq(inPlace, null)) ? (false) : (haxe.lang.Runtime.toBool(inPlace)) );
		hxPixels._Pixels.PixelsData res = ( (__temp_inPlace28) ? (pixels) : (hxPixels._Pixels.Pixels_Impl_.clone(pixels)) );
		if (( toFormat == pixels.format )) 
		{
			return res;
		}
		
		int i = 0;
		int pos = 0;
		if (( ( ( pixels.format == hxPixels.PixelFormat.BGRA ) && ( toFormat == hxPixels.PixelFormat.RGBA ) ) || ( ( pixels.format == hxPixels.PixelFormat.RGBA ) && ( toFormat == hxPixels.PixelFormat.BGRA ) ) )) 
		{
			while (( i < pixels.count ))
			{
				int i1 = ( pos + 1 );
				int r = ( pixels.bytes.b[( (( i1 & -4 )) + haxe.lang.Runtime.toInt(pixels.format.channelMap.__get(( i1 & 3 ))))] & 255 );
				int i2 = ( pos + 3 );
				int b = ( pixels.bytes.b[( (( i2 & -4 )) + haxe.lang.Runtime.toInt(pixels.format.channelMap.__get(( i2 & 3 ))))] & 255 );
				res.bytes.b[( pos + toFormat.ch1 )] = ((byte) (r) );
				res.bytes.b[( pos + toFormat.ch3 )] = ((byte) (b) );
				 ++ i;
				pos += 4;
			}
			
		}
		else
		{
			while (( i < pixels.count ))
			{
				int a = ( pixels.bytes.b[( (( pos & -4 )) + haxe.lang.Runtime.toInt(pixels.format.channelMap.__get(( pos & 3 ))))] & 255 );
				int i3 = ( pos + 1 );
				int r1 = ( pixels.bytes.b[( (( i3 & -4 )) + haxe.lang.Runtime.toInt(pixels.format.channelMap.__get(( i3 & 3 ))))] & 255 );
				int i4 = ( pos + 2 );
				int g = ( pixels.bytes.b[( (( i4 & -4 )) + haxe.lang.Runtime.toInt(pixels.format.channelMap.__get(( i4 & 3 ))))] & 255 );
				int i5 = ( pos + 3 );
				int b1 = ( pixels.bytes.b[( (( i5 & -4 )) + haxe.lang.Runtime.toInt(pixels.format.channelMap.__get(( i5 & 3 ))))] & 255 );
				res.bytes.b[( pos + toFormat.ch0 )] = ((byte) (a) );
				res.bytes.b[( pos + toFormat.ch1 )] = ((byte) (r1) );
				res.bytes.b[( pos + toFormat.ch2 )] = ((byte) (g) );
				res.bytes.b[( pos + toFormat.ch3 )] = ((byte) (b1) );
				 ++ i;
				pos += 4;
			}
			
		}
		
		res.format = toFormat;
		return res;
	}
	
	
//	public static hxPixels._Pixels.PixelsData fromBufferedImage(java.awt.image.BufferedImage image)
//	{
//		//line 388 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		hxPixels._Pixels.PixelsData this1 = new hxPixels._Pixels.PixelsData(image.getWidth(), image.getHeight(), true, null);
//		//line 388 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		hxPixels._Pixels.PixelsData pixels = ((hxPixels._Pixels.PixelsData) (this1) );
//		//line 389 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		pixels.format = hxPixels.PixelFormat.RGBA;
//		//line 391 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		int[] buffer = new int[pixels.bytes.length];
//		//line 392 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		buffer = image.getRaster().getPixels(((int) (0) ), ((int) (0) ), ((int) (pixels.width) ), ((int) (pixels.height) ), ((int[]) (buffer) ));
//		//line 394 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		{
//			//line 394 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//			int _g1 = 0;
//			//line 394 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//			int _g = buffer.length;
//			//line 394 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//			while (( _g1 < _g ))
//			{
//				//line 394 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//				int i = _g1++;
//				//line 394 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//				pixels.bytes.b[i] = ((byte) (buffer[i]) );
//			}
//
//		}
//
//		//line 396 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		return pixels;
//	}
	
	
//	public static void applyToBufferedImage(hxPixels._Pixels.PixelsData this1, java.awt.image.BufferedImage image)
//	{
//		//line 400 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		int[] buffer = new int[this1.bytes.length];
//		//line 401 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		{
//			//line 401 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//			int _g1 = 0;
//			//line 401 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//			int _g = buffer.length;
//			//line 401 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//			while (( _g1 < _g ))
//			{
//				//line 401 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//				int i = _g1++;
//				//line 401 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//				buffer[i] = ( this1.bytes.b[i] & 255 );
//			}
//
//		}
//
//		//line 403 "/Users/tao/projects/hxDaedalus/src/hxPixels/Pixels.hx"
//		image.getRaster().setPixels(((int) (0) ), ((int) (0) ), ((int) (this1.width) ), ((int) (this1.height) ), ((int[]) (buffer) ));
//	}
	
	
}


