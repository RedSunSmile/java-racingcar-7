#!/bin/bash

firstLine=`head -2 $1 | tail -1`
if [[ $firstLine == \#* ]]; then
  echo '<type>(<component>): <subject>' > .prepare-commit-msg-temp
  echo '' >> .prepare-commit-msg-temp
  echo '<body>' >> .prepare-commit-msg-temp
  echo '' >> .prepare-commit-msg-temp
  echo '# types: feat, fix, docs, style, refactor, test, chore(mantean)' >> .prepare-commit-msg-temp

  { cat .prepare-commit-msg-temp; cat $1; } > .prepare-commit-msg-temp2
  cat .prepare-commit-msg-temp2 > $1
  rm .prepare-commit-msg-temp .prepare-commit-msg-temp2
fi

