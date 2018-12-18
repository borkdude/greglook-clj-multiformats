(ns multiformats.test-runner
  (:require
    [doo.runner :refer-macros [doo-tests]]
    [multiformats.base-test]
    [multiformats.cid-test]
    [multiformats.codec-test]
    [multiformats.hash-test]
    [multiformats.varint-test]
    [multiformats.address.codec-test]
    [multiformats.address-test]))


(doo-tests
  'multiformats.varint-test
  'multiformats.base-test
  'multiformats.hash-test
  'multiformats.codec-test
  'multiformats.cid-test
  'multiformats.address.codec-test
  'multiformats.address-test)
