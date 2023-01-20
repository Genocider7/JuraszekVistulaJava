echo starting work > output.out
cd ..
for i in {1..10}
do
java Zadanie2/Main | grep "counted" >> Zadanie2/output.out
echo -en '\n' >> Zadanie2/output.out
done
