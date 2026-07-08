# rmw-test-fixture-implementation requires Zenoh when rmw-zenoh-cpp is present.
RDEPENDS:${PN}:remove = "${@'' if bb.utils.contains('BBFILE_COLLECTIONS', 'meta-zenoh', True, False, d) else 'rmw-test-fixture-implementation'}"
