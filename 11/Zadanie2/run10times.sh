echo starting work > output.out
cd ..
for i in {1..100}
do
echo test nr $i >> Zadanie2/output.out
java Zadanie2/Main | grep "counted" >> Zadanie2/output.out
echo -en '\n' >> Zadanie2/output.out
done
