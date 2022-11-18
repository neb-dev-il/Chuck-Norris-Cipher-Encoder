# Chuck Norris Cipher Encoder

Secret agents use encryption all the time. You know that everything can be encrypted as different characters. What about encryption that uses only one character and space? This method has a name — the Chuck Norris cipher. It is a program that can encrypt any text into a sequence of zeros and spaces and decrypt this sequence into text.

## Example
The greater-than symbol followed by a space (> ) represents the user input. Notice that it's not part of the input.

## Example 1
<pre>
Please input operation (encode/decode/exit):
> encode
Input string:
> Hey!
Encoded string:
0 0 00 00 0 0 00 000 0 00 00 00 0 0 00 0 0 00000 00 00 0 0 00 0 0 0 00 0000 0 0

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00 000 0 00 00 00 0 0 00 0 0 00000 00 00 0 0 00 0 0 0 00 0000 0 0
Decoded string:
Hey!

Please input operation (encode/decode/exit):
> exit
Bye!
</pre>

## Example 2
<pre>
Please input operation (encode/decode/exit):
> smile
There is no 'smile' operation

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00 000
Decoded string:
H

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 1 00 0 0 1 000
Encoded string is not valid.

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 000 0 00 00 0000 0 00 000
Encoded string is not valid.

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00
Encoded string is not valid.

Please input operation (encode/decode/exit):
> decode
Input encoded string:
> 0 0 00 00 0 0 00 00
Encoded string is not valid.

Please input operation (encode/decode/exit):
> exit
Bye!
</pre>