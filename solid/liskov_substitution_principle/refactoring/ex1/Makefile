PRGNAME=VehicleUtils
JCMP=javac
JRE=java

all: clean build test
	@printf "Finished, building $(PRGNAME)\n"

clean:
	@find . -type f -name "*.class" -delete

build:
	@$(JCMP) $(PRGNAME).java

test:
	@$(JRE) $(PRGNAME)
